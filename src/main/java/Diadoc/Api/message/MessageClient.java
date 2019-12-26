package Diadoc.Api.message;

import Diadoc.Api.Proto.Invoicing.InvoiceCorrectionRequestInfoProtos;
import Diadoc.Api.exceptions.DiadocException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos.Message;
import static Diadoc.Api.Proto.Events.DiadocMessage_GetApiProtos.MessagePatch;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.MessagePatchToPost;
import static Diadoc.Api.Proto.Events.DiadocMessage_PostApiProtos.MessageToPost;
import static Diadoc.Api.Proto.Invoicing.InvoiceCorrectionRequestInfoProtos.*;

public class MessageClient {
    private DiadocHttpClient diadocHttpClient;

    public MessageClient(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public Message postMessage(MessageToPost msg) throws DiadocSdkException {
        if (msg == null) {
            throw new IllegalArgumentException("msg");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/V3/PostMessage").build())
                    .setEntity(new ByteArrayEntity(msg.toByteArray()));

            return Message.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Message getMessage(String currentBoxId, String messageId, @Nullable String entityId, boolean withOriginalSignature, boolean injectEntityContent) throws DiadocSdkException {
        if (currentBoxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }

        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V5/GetMessage")
                    .addParameter("boxId", currentBoxId)
                    .addParameter("messageId", messageId)
                    .addParameter("injectEntityContent", String.valueOf(injectEntityContent))
                    .addParameter("originalSignature", String.valueOf(withOriginalSignature));

            if (!Tools.isNullOrEmpty(entityId)) {
                url.addParameter("entityId", entityId);
            }

            var request = RequestBuilder.get(url.build());
            return Message.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public Message getMessage(String currentBoxId, String messageId, String entityId) throws DiadocSdkException {
        return getMessage(currentBoxId, messageId, entityId, false, false);
    }

    public Message getMessage(String currentBoxId, String messageId, String entityId, boolean withOriginalSignature) throws DiadocSdkException {
        return getMessage(currentBoxId, messageId, entityId, withOriginalSignature, false);
    }

    public Message getMessage(String currentBoxId, String messageId, boolean withOriginalSignature, boolean injectEntityContent) throws DiadocSdkException {
        return getMessage(currentBoxId, messageId, null, withOriginalSignature, injectEntityContent);
    }

    public Message getMessage(String currentBoxId, String messageId) throws DiadocSdkException {
        return getMessage(currentBoxId, messageId, false, false);
    }

    public Message getMessage(String currentBoxId, String messageId, boolean withOriginalSignature) throws DiadocSdkException {
        return getMessage(currentBoxId, messageId, withOriginalSignature, false);
    }

    public MessagePatch postMessagePatch(MessagePatchToPost patch) throws DiadocSdkException {
        if (patch == null) {
            throw new IllegalArgumentException("patch");
        }

        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl()).setPath("/V3/PostMessagePatch").build())
                    .setEntity(new ByteArrayEntity(patch.toByteArray()));

            return MessagePatch.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void delete(String boxId, String messageId, String documentId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/Delete")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId);

            if (!Tools.isNullOrEmpty(documentId)) {
                url.addParameter("entityId", documentId);
            }

            var request = RequestBuilder.post(url.build()).setHeader("Content-Length", "0");
            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    public void recycleDraft(String boxId, String draftId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (draftId == null) {
            throw new IllegalArgumentException("draftId");
        }
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/RecycleDraft")
                            .addParameter("boxId", boxId)
                            .addParameter("draftId", draftId)
                            .build()).setHeader("Content-Length", "0");

            diadocHttpClient.performRequest(request);
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }



    public InvoiceCorrectionRequestInfo getInvoiceCorrectionRequestInfo(String boxId, String messageId, String entityId) throws DiadocSdkException {
        if (boxId == null) {
            throw new IllegalArgumentException("boxId");
        }
        if (messageId == null) {
            throw new IllegalArgumentException("messageId");
        }
        if (entityId == null) {
            throw new IllegalArgumentException("entityId");
        }
        try {
            var url = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/GetInvoiceCorrectionRequestInfo")
                    .addParameter("boxId", boxId)
                    .addParameter("messageId", messageId)
                    .addParameter("entityId", entityId);

            var request = RequestBuilder.get(url.build());
            return InvoiceCorrectionRequestInfo.parseFrom(diadocHttpClient.performRequest(request));
        } catch (URISyntaxException | IOException e) {
            throw new DiadocSdkException(e);
        }
    }
}
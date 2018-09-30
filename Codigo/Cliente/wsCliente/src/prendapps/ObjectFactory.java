
package prendapps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the prendapps package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CloseConection_QNAME = new QName("http://prendapps/", "closeConection");
    private final static QName _CloseConectionResponse_QNAME = new QName("http://prendapps/", "closeConectionResponse");
    private final static QName _Commit_QNAME = new QName("http://prendapps/", "commit");
    private final static QName _CommitResponse_QNAME = new QName("http://prendapps/", "commitResponse");
    private final static QName _GetConnection_QNAME = new QName("http://prendapps/", "getConnection");
    private final static QName _GetConnectionResponse_QNAME = new QName("http://prendapps/", "getConnectionResponse");
    private final static QName _GetLineRquests_QNAME = new QName("http://prendapps/", "getLineRquests");
    private final static QName _GetLineRquestsResponse_QNAME = new QName("http://prendapps/", "getLineRquestsResponse");
    private final static QName _GetRequests_QNAME = new QName("http://prendapps/", "getRequests");
    private final static QName _GetRequestsResponse_QNAME = new QName("http://prendapps/", "getRequestsResponse");
    private final static QName _Hola_QNAME = new QName("http://prendapps/", "hola");
    private final static QName _HolaResponse_QNAME = new QName("http://prendapps/", "holaResponse");
    private final static QName _InsertLineRequest_QNAME = new QName("http://prendapps/", "insertLineRequest");
    private final static QName _InsertLineRequestResponse_QNAME =
        new QName("http://prendapps/", "insertLineRequestResponse");
    private final static QName _InsertRequest_QNAME = new QName("http://prendapps/", "insertRequest");
    private final static QName _InsertRequestResponse_QNAME = new QName("http://prendapps/", "insertRequestResponse");
    private final static QName _RemoveLineRequest_QNAME = new QName("http://prendapps/", "removeLineRequest");
    private final static QName _RemoveLineRequestResponse_QNAME =
        new QName("http://prendapps/", "removeLineRequestResponse");
    private final static QName _RemoveRequest_QNAME = new QName("http://prendapps/", "removeRequest");
    private final static QName _RemoveRequestResponse_QNAME = new QName("http://prendapps/", "removeRequestResponse");
    private final static QName _UpdateLineRequest_QNAME = new QName("http://prendapps/", "updateLineRequest");
    private final static QName _UpdateLineRequestResponse_QNAME =
        new QName("http://prendapps/", "updateLineRequestResponse");
    private final static QName _UpdateRequest_QNAME = new QName("http://prendapps/", "updateRequest");
    private final static QName _UpdateRequestResponse_QNAME = new QName("http://prendapps/", "updateRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: prendapps
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CloseConection }
     *
     */
    public CloseConection createCloseConection() {
        return new CloseConection();
    }

    /**
     * Create an instance of {@link CloseConectionResponse }
     *
     */
    public CloseConectionResponse createCloseConectionResponse() {
        return new CloseConectionResponse();
    }

    /**
     * Create an instance of {@link Commit }
     *
     */
    public Commit createCommit() {
        return new Commit();
    }

    /**
     * Create an instance of {@link CommitResponse }
     *
     */
    public CommitResponse createCommitResponse() {
        return new CommitResponse();
    }

    /**
     * Create an instance of {@link GetConnection }
     *
     */
    public GetConnection createGetConnection() {
        return new GetConnection();
    }

    /**
     * Create an instance of {@link GetConnectionResponse }
     *
     */
    public GetConnectionResponse createGetConnectionResponse() {
        return new GetConnectionResponse();
    }

    /**
     * Create an instance of {@link GetLineRquests }
     *
     */
    public GetLineRquests createGetLineRquests() {
        return new GetLineRquests();
    }

    /**
     * Create an instance of {@link GetLineRquestsResponse }
     *
     */
    public GetLineRquestsResponse createGetLineRquestsResponse() {
        return new GetLineRquestsResponse();
    }

    /**
     * Create an instance of {@link GetRequests }
     *
     */
    public GetRequests createGetRequests() {
        return new GetRequests();
    }

    /**
     * Create an instance of {@link GetRequestsResponse }
     *
     */
    public GetRequestsResponse createGetRequestsResponse() {
        return new GetRequestsResponse();
    }

    /**
     * Create an instance of {@link Hola }
     *
     */
    public Hola createHola() {
        return new Hola();
    }

    /**
     * Create an instance of {@link HolaResponse }
     *
     */
    public HolaResponse createHolaResponse() {
        return new HolaResponse();
    }

    /**
     * Create an instance of {@link InsertLineRequest }
     *
     */
    public InsertLineRequest createInsertLineRequest() {
        return new InsertLineRequest();
    }

    /**
     * Create an instance of {@link InsertLineRequestResponse }
     *
     */
    public InsertLineRequestResponse createInsertLineRequestResponse() {
        return new InsertLineRequestResponse();
    }

    /**
     * Create an instance of {@link InsertRequest }
     *
     */
    public InsertRequest createInsertRequest() {
        return new InsertRequest();
    }

    /**
     * Create an instance of {@link InsertRequestResponse }
     *
     */
    public InsertRequestResponse createInsertRequestResponse() {
        return new InsertRequestResponse();
    }

    /**
     * Create an instance of {@link RemoveLineRequest }
     *
     */
    public RemoveLineRequest createRemoveLineRequest() {
        return new RemoveLineRequest();
    }

    /**
     * Create an instance of {@link RemoveLineRequestResponse }
     *
     */
    public RemoveLineRequestResponse createRemoveLineRequestResponse() {
        return new RemoveLineRequestResponse();
    }

    /**
     * Create an instance of {@link RemoveRequest }
     *
     */
    public RemoveRequest createRemoveRequest() {
        return new RemoveRequest();
    }

    /**
     * Create an instance of {@link RemoveRequestResponse }
     *
     */
    public RemoveRequestResponse createRemoveRequestResponse() {
        return new RemoveRequestResponse();
    }

    /**
     * Create an instance of {@link UpdateLineRequest }
     *
     */
    public UpdateLineRequest createUpdateLineRequest() {
        return new UpdateLineRequest();
    }

    /**
     * Create an instance of {@link UpdateLineRequestResponse }
     *
     */
    public UpdateLineRequestResponse createUpdateLineRequestResponse() {
        return new UpdateLineRequestResponse();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     *
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link UpdateRequestResponse }
     *
     */
    public UpdateRequestResponse createUpdateRequestResponse() {
        return new UpdateRequestResponse();
    }

    /**
     * Create an instance of {@link LineRequest }
     *
     */
    public LineRequest createLineRequest() {
        return new LineRequest();
    }

    /**
     * Create an instance of {@link Request }
     *
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConection }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "closeConection")
    public JAXBElement<CloseConection> createCloseConection(CloseConection value) {
        return new JAXBElement<CloseConection>(_CloseConection_QNAME, CloseConection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConectionResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "closeConectionResponse")
    public JAXBElement<CloseConectionResponse> createCloseConectionResponse(CloseConectionResponse value) {
        return new JAXBElement<CloseConectionResponse>(_CloseConectionResponse_QNAME, CloseConectionResponse.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commit }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "commit")
    public JAXBElement<Commit> createCommit(Commit value) {
        return new JAXBElement<Commit>(_Commit_QNAME, Commit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "commitResponse")
    public JAXBElement<CommitResponse> createCommitResponse(CommitResponse value) {
        return new JAXBElement<CommitResponse>(_CommitResponse_QNAME, CommitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnection }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getConnection")
    public JAXBElement<GetConnection> createGetConnection(GetConnection value) {
        return new JAXBElement<GetConnection>(_GetConnection_QNAME, GetConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectionResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getConnectionResponse")
    public JAXBElement<GetConnectionResponse> createGetConnectionResponse(GetConnectionResponse value) {
        return new JAXBElement<GetConnectionResponse>(_GetConnectionResponse_QNAME, GetConnectionResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineRquests }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getLineRquests")
    public JAXBElement<GetLineRquests> createGetLineRquests(GetLineRquests value) {
        return new JAXBElement<GetLineRquests>(_GetLineRquests_QNAME, GetLineRquests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLineRquestsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getLineRquestsResponse")
    public JAXBElement<GetLineRquestsResponse> createGetLineRquestsResponse(GetLineRquestsResponse value) {
        return new JAXBElement<GetLineRquestsResponse>(_GetLineRquestsResponse_QNAME, GetLineRquestsResponse.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequests }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getRequests")
    public JAXBElement<GetRequests> createGetRequests(GetRequests value) {
        return new JAXBElement<GetRequests>(_GetRequests_QNAME, GetRequests.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRequestsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "getRequestsResponse")
    public JAXBElement<GetRequestsResponse> createGetRequestsResponse(GetRequestsResponse value) {
        return new JAXBElement<GetRequestsResponse>(_GetRequestsResponse_QNAME, GetRequestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hola }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "hola")
    public JAXBElement<Hola> createHola(Hola value) {
        return new JAXBElement<Hola>(_Hola_QNAME, Hola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "holaResponse")
    public JAXBElement<HolaResponse> createHolaResponse(HolaResponse value) {
        return new JAXBElement<HolaResponse>(_HolaResponse_QNAME, HolaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLineRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "insertLineRequest")
    public JAXBElement<InsertLineRequest> createInsertLineRequest(InsertLineRequest value) {
        return new JAXBElement<InsertLineRequest>(_InsertLineRequest_QNAME, InsertLineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertLineRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "insertLineRequestResponse")
    public JAXBElement<InsertLineRequestResponse> createInsertLineRequestResponse(InsertLineRequestResponse value) {
        return new JAXBElement<InsertLineRequestResponse>(_InsertLineRequestResponse_QNAME,
                                                          InsertLineRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "insertRequest")
    public JAXBElement<InsertRequest> createInsertRequest(InsertRequest value) {
        return new JAXBElement<InsertRequest>(_InsertRequest_QNAME, InsertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "insertRequestResponse")
    public JAXBElement<InsertRequestResponse> createInsertRequestResponse(InsertRequestResponse value) {
        return new JAXBElement<InsertRequestResponse>(_InsertRequestResponse_QNAME, InsertRequestResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLineRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "removeLineRequest")
    public JAXBElement<RemoveLineRequest> createRemoveLineRequest(RemoveLineRequest value) {
        return new JAXBElement<RemoveLineRequest>(_RemoveLineRequest_QNAME, RemoveLineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLineRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "removeLineRequestResponse")
    public JAXBElement<RemoveLineRequestResponse> createRemoveLineRequestResponse(RemoveLineRequestResponse value) {
        return new JAXBElement<RemoveLineRequestResponse>(_RemoveLineRequestResponse_QNAME,
                                                          RemoveLineRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "removeRequest")
    public JAXBElement<RemoveRequest> createRemoveRequest(RemoveRequest value) {
        return new JAXBElement<RemoveRequest>(_RemoveRequest_QNAME, RemoveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "removeRequestResponse")
    public JAXBElement<RemoveRequestResponse> createRemoveRequestResponse(RemoveRequestResponse value) {
        return new JAXBElement<RemoveRequestResponse>(_RemoveRequestResponse_QNAME, RemoveRequestResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLineRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "updateLineRequest")
    public JAXBElement<UpdateLineRequest> createUpdateLineRequest(UpdateLineRequest value) {
        return new JAXBElement<UpdateLineRequest>(_UpdateLineRequest_QNAME, UpdateLineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLineRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "updateLineRequestResponse")
    public JAXBElement<UpdateLineRequestResponse> createUpdateLineRequestResponse(UpdateLineRequestResponse value) {
        return new JAXBElement<UpdateLineRequestResponse>(_UpdateLineRequestResponse_QNAME,
                                                          UpdateLineRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "updateRequest")
    public JAXBElement<UpdateRequest> createUpdateRequest(UpdateRequest value) {
        return new JAXBElement<UpdateRequest>(_UpdateRequest_QNAME, UpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequestResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://prendapps/", name = "updateRequestResponse")
    public JAXBElement<UpdateRequestResponse> createUpdateRequestResponse(UpdateRequestResponse value) {
        return new JAXBElement<UpdateRequestResponse>(_UpdateRequestResponse_QNAME, UpdateRequestResponse.class, null,
                                                      value);
    }

}

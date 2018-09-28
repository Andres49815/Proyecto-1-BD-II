
package componentejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the componentejb package.
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

    private final static QName _CloseConexion_QNAME = new QName("http://componentejb/", "closeConexion");
    private final static QName _CloseConexionResponse_QNAME =
        new QName("http://componentejb/", "closeConexionResponse");
    private final static QName _Commit_QNAME = new QName("http://componentejb/", "commit");
    private final static QName _CommitResponse_QNAME = new QName("http://componentejb/", "commitResponse");
    private final static QName _GetConnection_QNAME = new QName("http://componentejb/", "getConnection");
    private final static QName _GetConnectionResponse_QNAME =
        new QName("http://componentejb/", "getConnectionResponse");
    private final static QName _GetGarments_QNAME = new QName("http://componentejb/", "getGarments");
    private final static QName _GetGarmentsResponse_QNAME = new QName("http://componentejb/", "getGarmentsResponse");
    private final static QName _InsertGarment_QNAME = new QName("http://componentejb/", "insertGarment");
    private final static QName _InsertGarmentResponse_QNAME =
        new QName("http://componentejb/", "insertGarmentResponse");
    private final static QName _RemoveGarment_QNAME = new QName("http://componentejb/", "removeGarment");
    private final static QName _RemoveGarmentResponse_QNAME =
        new QName("http://componentejb/", "removeGarmentResponse");
    private final static QName _UpdateGarment_QNAME = new QName("http://componentejb/", "updateGarment");
    private final static QName _UpdateGarmentResponse_QNAME =
        new QName("http://componentejb/", "updateGarmentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: componentejb
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CloseConexion }
     *
     */
    public CloseConexion createCloseConexion() {
        return new CloseConexion();
    }

    /**
     * Create an instance of {@link CloseConexionResponse }
     *
     */
    public CloseConexionResponse createCloseConexionResponse() {
        return new CloseConexionResponse();
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
     * Create an instance of {@link GetGarments }
     *
     */
    public GetGarments createGetGarments() {
        return new GetGarments();
    }

    /**
     * Create an instance of {@link GetGarmentsResponse }
     *
     */
    public GetGarmentsResponse createGetGarmentsResponse() {
        return new GetGarmentsResponse();
    }

    /**
     * Create an instance of {@link InsertGarment }
     *
     */
    public InsertGarment createInsertGarment() {
        return new InsertGarment();
    }

    /**
     * Create an instance of {@link InsertGarmentResponse }
     *
     */
    public InsertGarmentResponse createInsertGarmentResponse() {
        return new InsertGarmentResponse();
    }

    /**
     * Create an instance of {@link RemoveGarment }
     *
     */
    public RemoveGarment createRemoveGarment() {
        return new RemoveGarment();
    }

    /**
     * Create an instance of {@link RemoveGarmentResponse }
     *
     */
    public RemoveGarmentResponse createRemoveGarmentResponse() {
        return new RemoveGarmentResponse();
    }

    /**
     * Create an instance of {@link UpdateGarment }
     *
     */
    public UpdateGarment createUpdateGarment() {
        return new UpdateGarment();
    }

    /**
     * Create an instance of {@link UpdateGarmentResponse }
     *
     */
    public UpdateGarmentResponse createUpdateGarmentResponse() {
        return new UpdateGarmentResponse();
    }

    /**
     * Create an instance of {@link Garment }
     *
     */
    public Garment createGarment() {
        return new Garment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConexion }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseConexion }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "closeConexion")
    public JAXBElement<CloseConexion> createCloseConexion(CloseConexion value) {
        return new JAXBElement<CloseConexion>(_CloseConexion_QNAME, CloseConexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseConexionResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseConexionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "closeConexionResponse")
    public JAXBElement<CloseConexionResponse> createCloseConexionResponse(CloseConexionResponse value) {
        return new JAXBElement<CloseConexionResponse>(_CloseConexionResponse_QNAME, CloseConexionResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commit }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Commit }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "commit")
    public JAXBElement<Commit> createCommit(Commit value) {
        return new JAXBElement<Commit>(_Commit_QNAME, Commit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "commitResponse")
    public JAXBElement<CommitResponse> createCommitResponse(CommitResponse value) {
        return new JAXBElement<CommitResponse>(_CommitResponse_QNAME, CommitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnection }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConnection }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "getConnection")
    public JAXBElement<GetConnection> createGetConnection(GetConnection value) {
        return new JAXBElement<GetConnection>(_GetConnection_QNAME, GetConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectionResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetConnectionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "getConnectionResponse")
    public JAXBElement<GetConnectionResponse> createGetConnectionResponse(GetConnectionResponse value) {
        return new JAXBElement<GetConnectionResponse>(_GetConnectionResponse_QNAME, GetConnectionResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGarments }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGarments }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "getGarments")
    public JAXBElement<GetGarments> createGetGarments(GetGarments value) {
        return new JAXBElement<GetGarments>(_GetGarments_QNAME, GetGarments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGarmentsResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGarmentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "getGarmentsResponse")
    public JAXBElement<GetGarmentsResponse> createGetGarmentsResponse(GetGarmentsResponse value) {
        return new JAXBElement<GetGarmentsResponse>(_GetGarmentsResponse_QNAME, GetGarmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertGarment }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertGarment }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "insertGarment")
    public JAXBElement<InsertGarment> createInsertGarment(InsertGarment value) {
        return new JAXBElement<InsertGarment>(_InsertGarment_QNAME, InsertGarment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertGarmentResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertGarmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "insertGarmentResponse")
    public JAXBElement<InsertGarmentResponse> createInsertGarmentResponse(InsertGarmentResponse value) {
        return new JAXBElement<InsertGarmentResponse>(_InsertGarmentResponse_QNAME, InsertGarmentResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveGarment }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveGarment }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "removeGarment")
    public JAXBElement<RemoveGarment> createRemoveGarment(RemoveGarment value) {
        return new JAXBElement<RemoveGarment>(_RemoveGarment_QNAME, RemoveGarment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveGarmentResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveGarmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "removeGarmentResponse")
    public JAXBElement<RemoveGarmentResponse> createRemoveGarmentResponse(RemoveGarmentResponse value) {
        return new JAXBElement<RemoveGarmentResponse>(_RemoveGarmentResponse_QNAME, RemoveGarmentResponse.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGarment }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateGarment }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "updateGarment")
    public JAXBElement<UpdateGarment> createUpdateGarment(UpdateGarment value) {
        return new JAXBElement<UpdateGarment>(_UpdateGarment_QNAME, UpdateGarment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGarmentResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateGarmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://componentejb/", name = "updateGarmentResponse")
    public JAXBElement<UpdateGarmentResponse> createUpdateGarmentResponse(UpdateGarmentResponse value) {
        return new JAXBElement<UpdateGarmentResponse>(_UpdateGarmentResponse_QNAME, UpdateGarmentResponse.class, null,
                                                      value);
    }

}

package cl.ucn.disc.as.model.query;

import cl.ucn.disc.as.model.Departamento;
import cl.ucn.disc.as.model.query.QEdificio;
import io.ebean.typequery.PInstant;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQRootBean;

/**
 * Query bean for Departamento.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@io.ebean.typequery.Generated("io.ebean.querybean.generator")
@io.ebean.typequery.TypeQueryBean("v1")
public final class QDepartamento extends TQRootBean<Departamento,QDepartamento> {

  private static final QDepartamento _alias = new QDepartamento(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDepartamento alias() {
    return _alias;
  }

  public PLong<QDepartamento> id;
  public PLong<QDepartamento> version;
  public PInstant<QDepartamento> created;
  public PInstant<QDepartamento> modified;
  public PInteger<QDepartamento> numero;
  public PInteger<QDepartamento> piso;
  public QEdificio.Assoc<QDepartamento> edificio;


  /**
   * Return a query bean used to build a FetchGroup.
   * <p>
   * FetchGroups are immutable and threadsafe and can be used by many
   * concurrent queries. We typically stored FetchGroup as a static final field.
   * <p>
   * Example creating and using a FetchGroup.
   * <pre>{@code
   * 
   * static final FetchGroup<Customer> fetchGroup = 
   *   QCustomer.forFetchGroup()
   *     .shippingAddress.fetch()
   *     .contacts.fetch()
   *     .buildFetchGroup();
   * 
   * List<Customer> customers = new QCustomer()
   *   .select(fetchGroup)
   *   .findList();
   * 
   * }</pre>
   */
  public static QDepartamento forFetchGroup() {
    return new QDepartamento(io.ebean.FetchGroup.queryFor(Departamento.class));
  }

  /** Construct using the default Database */
  public QDepartamento() {
    super(Departamento.class);
  }

  /** Construct with a given transaction */
  public QDepartamento(io.ebean.Transaction transaction) {
    super(Departamento.class, transaction);
  }

  /** Construct with a given Database */
  public QDepartamento(io.ebean.Database database) {
    super(Departamento.class, database);
  }


  /** Private constructor for Alias */
  private QDepartamento(boolean dummy) {
    super(dummy);
  }

  /** Private constructor for FetchGroup building */
  private QDepartamento(io.ebean.Query<Departamento> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /** Private constructor for filterMany */
  private QDepartamento(io.ebean.ExpressionList<Departamento> filter) {
    super(filter);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  public static final class Alias {
    public static PLong<QDepartamento> id = _alias.id;
    public static PLong<QDepartamento> version = _alias.version;
    public static PInstant<QDepartamento> created = _alias.created;
    public static PInstant<QDepartamento> modified = _alias.modified;
    public static PInteger<QDepartamento> numero = _alias.numero;
    public static PInteger<QDepartamento> piso = _alias.piso;
    public static QEdificio.Assoc<QDepartamento> edificio = _alias.edificio;
  }

  /**  Association query bean */
  @io.ebean.typequery.Generated("io.ebean.querybean.generator")
  @io.ebean.typequery.TypeQueryBean("v1")
  public static final class Assoc<R> extends TQAssocBean<Departamento,R,QDepartamento> {
    public PLong<R> id;
    public PLong<R> version;
    public PInstant<R> created;
    public PInstant<R> modified;
    public PInteger<R> numero;
    public PInteger<R> piso;
    public QEdificio.Assoc<R> edificio;

    public Assoc(String name, R root) {
      super(name, root);
    }

    public Assoc(String name, R root, String prefix) {
      super(name, root, prefix);
    }

    public final R filterMany(java.util.function.Consumer<QDepartamento> apply) {
      final io.ebean.ExpressionList list = io.ebean.Expr.factory().expressionList();
      final var qb = new QDepartamento(list);
      apply.accept(qb);
      expr().filterMany(_name).addAll(list);
      return _root;
    }
  }
}

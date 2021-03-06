package  br.com.edza.cjus.model.cjus;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cnj_assinatura")
public class Assinatura implements Serializable {

	public Assinatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assinatura(Integer id, Integer fkDocumento, String assinatura, String algoritmo_hash_assinatura,
			String cadeia_certificado_assinatura, String codificacao_certificado_assinatura, String data_assinatura,
			String signatatio_login_identficador) {
		super();
		this.id = id;
		this.fkDocumento = fkDocumento;
		this.assinatura = assinatura;
		this.algoritmo_hash_assinatura = algoritmo_hash_assinatura;
		this.cadeia_certificado_assinatura = cadeia_certificado_assinatura;
		this.codificacao_certificado_assinatura = codificacao_certificado_assinatura;
		this.data_assinatura = data_assinatura;
		this.signatatio_login_identficador = signatatio_login_identficador;
	}

	public Assinatura(Integer fkDocumento) {
		super();
		this.fkDocumento = fkDocumento;
	}

	
	@Id
	@Column(name = "cnj_assinatura_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "fk_id_documento")
	private Integer fkDocumento;
	
	@Column(name = "assinatura")
	private String assinatura;

	@Column(name = "algoritmo_hash_assinatura")
	private String algoritmo_hash_assinatura;

	@Column(name = "cadeia_certificado_assinatura")
	private String cadeia_certificado_assinatura;

	@Column(name = "codificacao_certificado_assinatura")
	private String codificacao_certificado_assinatura;

	@Column(name = "data_assinatura")
	private String data_assinatura;

	@Column(name = "signatatio_login_identficador")
	private String signatatio_login_identficador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkDocumento() {
		return fkDocumento;
	}

	public void setFkDocumento(Integer fkDocumento) {
		this.fkDocumento = fkDocumento;
	}

	public String getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}

	public String getAlgoritmo_hash_assinatura() {
		return algoritmo_hash_assinatura;
	}

	public void setAlgoritmo_hash_assinatura(String algoritmo_hash_assinatura) {
		this.algoritmo_hash_assinatura = algoritmo_hash_assinatura;
	}

	public String getCadeia_certificado_assinatura() {
		return cadeia_certificado_assinatura;
	}

	public void setCadeia_certificado_assinatura(String cadeia_certificado_assinatura) {
		this.cadeia_certificado_assinatura = cadeia_certificado_assinatura;
	}

	public String getCodificacao_certificado_assinatura() {
		return codificacao_certificado_assinatura;
	}

	public void setCodificacao_certificado_assinatura(String codificacao_certificado_assinatura) {
		this.codificacao_certificado_assinatura = codificacao_certificado_assinatura;
	}

	public String getData_assinatura() {
		return data_assinatura;
	}

	public void setData_assinatura(String data_assinatura) {
		this.data_assinatura = data_assinatura;
	}

	public String getSignatatio_login_identficador() {
		return signatatio_login_identficador;
	}

	public void setSignatatio_login_identficador(String signatatio_login_identficador) {
		this.signatatio_login_identficador = signatatio_login_identficador;
	}

}


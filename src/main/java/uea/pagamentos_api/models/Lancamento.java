package uea.pagamentos_api.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import uea.pagamentos_api.models.enums.TipoLancamento;

@Entity
public class Lancamento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Gerar id automático
	private Long codigo;
	private String descricao;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private String observacao;
	private TipoLancamento tipoLancamento;

	public Lancamento() {
	}

	public Lancamento(Long codigo, String descricao, LocalDate dataVencimento, LocalDate dataPagamento,
			BigDecimal valor, String observacao, TipoLancamento tipoLancamento) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.observacao = observacao;
		this.tipoLancamento = tipoLancamento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public Lancamento(Long codigo) {
		super();
		this.codigo = codigo;
	}

}

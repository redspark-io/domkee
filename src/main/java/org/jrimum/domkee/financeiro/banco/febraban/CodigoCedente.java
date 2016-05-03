package org.jrimum.domkee.financeiro.banco.febraban;

import org.jrimum.utilix.Objects;

public class CodigoCedente {

  private Integer codigoCedente = 0;
  private String digitoCedente = "";

  public CodigoCedente() {
  }

  public CodigoCedente(Integer codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  public CodigoCedente(Integer codigoCedente, String digitoCedente) {
    this.codigoCedente = codigoCedente;
    this.digitoCedente = digitoCedente;
  }

  public Integer getCodigoCedente() {
    return codigoCedente;
  }

  public void setCodigoCedente(Integer codigoCedente) {
    this.codigoCedente = codigoCedente;
  }

  public String getDigitoCedente() {
    return digitoCedente;
  }

  public void setDigitoCedente(String digitoCedente) {
    this.digitoCedente = digitoCedente;
  }

  @Override
  public String toString() {
    return Objects.toString(this);
  }
}

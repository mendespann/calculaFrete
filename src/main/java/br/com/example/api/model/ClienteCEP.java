package br.com.example.api.model;

public class ClienteCEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private double frete;
    
    public ClienteCEP(String cep, String logradouro, String complemento, String bairro, String localidade, String uf,
        double frete) {
      this.cep = cep;
      this.logradouro = logradouro;
      this.complemento = complemento;
      this.bairro = bairro;
      this.localidade = localidade;
      this.uf = uf;
      this.frete = frete;
    }

    public String getCep() {
      return cep;
    }
    public void setCep(String cep) {
      this.cep = cep;
    }
    public String getLogradouro() {
      return logradouro;
    }
    public void setLogradouro(String logradouro) {
      this.logradouro = logradouro;
    }
    public String getComplemento() {
      return complemento;
    }
    public void setComplemento(String complemento) {
      this.complemento = complemento;
    }
    public String getBairro() {
      return bairro;
    }
    public void setBairro(String bairro) {
      this.bairro = bairro;
    }
    public String getLocalidade() {
      return localidade;
    }
    public void setLocalidade(String localidade) {
      this.localidade = localidade;
    }
    public String getUf() {
      return uf;
    }
    public void setUf(String uf) {
      this.uf = uf;
    }
    public double getFrete() {
      return frete;
    }
    public void setFrete(double frete) {
      this.frete = frete;
    }

    public double calcularFrete(String uf) {
      switch (uf) {
          case "SP":
          case "RJ":
          case "ES":
          case "MG":
              frete = 7.85;
              break;
          case "DF":
          case "GO":
          case "MT":
          case "MS":
              frete = 12.50;
              break;
          case "BA":
          case "SE":
          case "AL":
          case "PE":
          case "PB":
          case "RN":
          case "CE":
          case "PI":
          case "MA":
              frete = 15.98;
              break;
          case "PR":
          case "SC":
          case "RS":
              frete = 17.30;
              break;
          case "AC":
          case "AP":
          case "AM":
          case "PA":
          case "RO":
          case "RR":
          case "TO":
              frete = 20.83;
              break;
          default:
              break;
      }
      
      return frete;
  }

}

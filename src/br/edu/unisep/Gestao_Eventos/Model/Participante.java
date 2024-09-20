package br.edu.unisep.Gestao_Eventos.Model;

public class Participante {
    private int id;
    private String nome;
    private String email;

    public Participante() {
    }

    public Participante(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Participante\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email;
    }

}
package com.itsaimao;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Idiom implements Serializable {
    private int id; // 1, 2, 3
    private char alphabet; // a, b, c
    private String idiom; // "Crocodile Tear"
    private String meaning; // "Shedding tears of crocodile" - to pretend to be sad or sorry when you are not really sad or sorry at all
    private List<String> examples; //

    public Idiom(int id, char alphabet, String idiom, String meaning, List<String> examples) {
        this.id = id;
        this.alphabet = alphabet;
        this.idiom = idiom;
        this.meaning = meaning;
        this.examples = examples;
    }

    // Getters
    public int getId() {
        return id;
    }

    public char getAlphabet() {
        return alphabet;
    }

    public String getIdiom() {
        return idiom;
    }

    public String getMeaning() {
        return meaning;
    }

    public List<String> getExamples() {
        return examples;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setAlphabet(char alphabet) {
        this.alphabet = alphabet;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setExamples(List<String> examples) {
        this.examples = examples;
    }

    @Override
    public String toString() {
        return idiom;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Idiom)) return false;
        Idiom idiom1 = (Idiom) o;
        return Objects.equals(idiom.toLowerCase(), idiom1.idiom.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idiom);
    }
}
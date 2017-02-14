package main

import (
	"fmt"
	"strings"
)

type Pessoa struct {
	nome      string
	sobrenome string
	entrada   string
}

func (p Pessoa) String() string {
	return p.nome + " " + p.sobrenome
}

func (p *Pessoa) formata() {
	nomeSobrenome := strings.Split(p.entrada, ", ")

	if len(nomeSobrenome) == 1 {
		nomeSobrenome := strings.Split(nomeSobrenome[0], " ")
		p.nome = nomeSobrenome[0]
		p.sobrenome = nomeSobrenome[1]
	}

	if len(nomeSobrenome) == 2 {
		p.nome = strings.Trim(nomeSobrenome[1], " ")
		p.sobrenome = nomeSobrenome[0]
	}
}

func NewFactoryPessoa(nomes ...string) []Pessoa {
	pessoas := make([]Pessoa, 0)

	for _, nomeCompleto := range nomes {
		pessoa := Pessoa{entrada: nomeCompleto}
		pessoa.formata()
		pessoas = append(pessoas, pessoa)
	}

	return pessoas
}

func main() {
	pessoas := NewFactoryPessoa("Ferreira, Joffily", "Marianna Veríssimo")
	fmt.Println(pessoas)
}

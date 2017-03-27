//
//  ViewController.swift
//  Andre
//
//  Created by admin on 17/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class SugerirViewController: UIViewController {

    var cadastro:Cadastro!
    var sugestao:Sugestao!
    @IBOutlet var nomeInput: UITextField!
    @IBOutlet var chocolateInput: UITextField!
    @IBOutlet var dataEntrega: UIDatePicker!

    override func viewDidLoad() {

        super.viewDidLoad()
        self.navigationItem.rightBarButtonItem = UIBarButtonItem(barButtonSystemItem: UIBarButtonSystemItem.save, target: self, action: #selector(cadastrar))
    }

    func cadastrar() {
        let nome = self.nomeInput.text
        let chocolate = self.chocolateInput.text
        let data = self.dataEntrega.date


        if (self.sugestao != nil) {
            self.sugestao.nome = nome
            self.sugestao.chocolate = chocolate
            self.sugestao.data = data
        } else {
            let sugestao = Sugestao(nome: nome!, chocolate: chocolate!, data: data)
            self.cadastro.addSugestao(sugestao: sugestao)
        }


        self.navigationController?.popViewController(animated: true)
    }


    override func viewWillAppear(_ animated: Bool) {
        if (self.sugestao != nil) {
            nomeInput.text = self.sugestao.nome
            chocolateInput.text = self.sugestao.chocolate
            dataEntrega.date = self.sugestao.data
        }
    }

}


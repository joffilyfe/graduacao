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
        let sugestao = Sugestao(nome: nome!, chocolate: chocolate!, data: data)
        self.cadastro.addSugestao(sugestao: sugestao)


        self.navigationController?.popViewController(animated: true)
    }

}


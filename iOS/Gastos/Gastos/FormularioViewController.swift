//
//  ViewController.swift
//  Gastos
//
//  Created by admin on 28/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class FormularioViewController: UIViewController {

    @IBOutlet var inputDescricao: UITextField!
    @IBOutlet var inputValor: UITextField!
    @IBOutlet var inputData: UIDatePicker!
    var cadastro:Cadastro!
    var gasto:Gasto!

    override func viewDidLoad() {
        super.viewDidLoad()
        self.navigationItem.rightBarButtonItem = UIBarButtonItem(barButtonSystemItem: UIBarButtonSystemItem.save, target: self, action: #selector(salvar))
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)

        if (gasto != nil) {
            self.inputDescricao.text = self.gasto.descricao
            self.inputValor.text = String(self.gasto.valor)
            self.inputData.date = self.gasto.data
        }
    }

    func salvar() {
        let descricao = self.inputDescricao.text
        let valor = Int(self.inputValor.text!)
        let data = self.inputData.date


        if (self.gasto != nil) {
            self.gasto.descricao = descricao
            self.gasto.valor = valor
            self.gasto.data = data
        } else {
            let gasto = Gasto(descricao: descricao!, valor: valor!, data: data)
            self.cadastro.add(gasto: gasto)
        }

        self.navigationController?.popViewController(animated: true)
    }

}


//
//  LancheViewController.swift
//  DeboraFood
//
//  Created by admin on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class LancheViewController: UIViewController {

    var lanche:Lanche!
    @IBOutlet var lbNome: UILabel!
    @IBOutlet var lbDescricao: UILabel!
    @IBOutlet var lbValor: UILabel!
    @IBOutlet var lbQtde: UILabel!
    @IBOutlet var stepQtd: UIStepper!


    override func viewDidLoad() {
        super.viewDidLoad()
        navigationItem.title = "Detalhes do lanche"
    }

    override func viewWillAppear(_ animated: Bool) {
        lbNome.text = self.lanche.nome
        lbDescricao.text = self.lanche.descricao
        lbValor.text = "R$ \(self.lanche.valor!)"
    }


    @IBAction func qtde(_ sender: Any) {
        self.lbQtde.text = String(Int(self.stepQtd.value))
        self.lanche.qtd = Int(self.stepQtd.value)
    }


    @IBAction func pedir(_ sender: Any) {
        let ad = UIApplication.shared.delegate as! AppDelegate
        let lanche = Lanche(nome: self.lanche.nome, valor: self.lanche.valor, descricao: self.lanche.descricao)
        lanche.qtd = Int(self.stepQtd.value)
        ad.comanda.add(lanche: lanche)
    }

}

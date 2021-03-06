//
//  FormularioViewController.swift
//  Carnaval
//
//  Created by admin on 24/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class FormularioViewController: UIViewController {


    @IBOutlet var tfNome: UITextField!
    @IBOutlet var tfValor: UITextField!
    @IBOutlet var lbQuantidade: UILabel!
    @IBOutlet var stpQuantidade: UIStepper!
    var stFormulario:String!
    var cadastro:Cadastro!

    @IBAction func quantidade(_ sender: Any) {
        let qtd = Int(self.stpQuantidade.value)
        self.lbQuantidade.text = String(qtd)
    }

    @IBAction func salvar(_ sender: Any) {
        let nome = self.tfNome.text
        let valor = Float(self.tfValor.text!)
        let qtd = Int(self.stpQuantidade.value)
        let bloco = Bloco(nome: nome!, valor: valor!, quantidade: qtd)

        print(bloco)
        self.cadastro.add(bloco: bloco)
        self.navigationController?.popViewController(animated: true)
    }

    // MARK: - Navigation
    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        print(segue.destination)
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }

    /*
    override func viewDidLoad() {
        super.viewDidLoad()
        print("viewDidLoad - Formulario")
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        print("viewWillAppear - Formulário")
    }

    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(true)
        print("viewDidDisappear - Formulario")
    }

    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(true)
        print("viewWillDisappear - Formulário")
    }

    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(true)
        print("viewDidAppear - Formulario")
    }
     */

}

//
//  ViewController.swift
//  Pessoas
//
//  Created by admin on 13/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var tfNome: UITextField!
    @IBOutlet var tfIdade: UITextField!
    @IBOutlet var lbContador: UILabel!

    @IBAction func salvar(_ sender: Any) {
        print("Funfo")
    }

    @IBAction func limpar(_ sender: Any) {
        print("Limpou")
    }

    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        self.view.endEditing(true)
    }
}


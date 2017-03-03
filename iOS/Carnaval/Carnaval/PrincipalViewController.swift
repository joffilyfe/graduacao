//
//  ViewController.swift
//  Carnaval
//
//  Created by admin on 24/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class PrincipalViewController: UIViewController {

    var cadastro = Cadastro()

    /*
    override func viewDidLoad() {
        super.viewDidLoad()
        print("viewDidLoad - Principal")
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        print("viewWillAppear - Principal")
    }

    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(true)
        print("viewDidDisappear - Principal")
    }

    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(true)
        print("viewWillDisappear - Principal")
    }

    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(true)
        print("viewDidAppear - Principal")
    }
    */

    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {

        if (segue.identifier == "principal_sobre") {
            let sobreVC = segue.destination as! SobreViewController
            sobreVC.cadastro = self.cadastro
        } else if (segue.identifier == "principal_formulario") {
            let formularioVC = segue.destination as! FormularioViewController
            formularioVC.cadastro = self.cadastro
        }
    }
}


//
//  ViewController.swift
//  NovoProjeto
//
//  Created by admin on 20/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class ViewController: UIViewController {


    @IBOutlet var lbVolume: UILabel!
    @IBOutlet var slVolume: UISlider!
    @IBOutlet var stGostou: UISwitch!
    @IBOutlet var lbNota: UILabel!
    @IBOutlet var stpNota: UIStepper!


    @IBAction func volume(_ sender: Any) {
        let valor = Int(self.slVolume.value)
        self.lbVolume.text = String(valor)
    }

    @IBAction func nota(_ sender: Any) {
        let valor = Int(self.stpNota.value)
        self.lbNota.text = String(valor)
    }

    @IBAction func verEscolhidos(_ sender: Any) {
        let volume = Int(self.slVolume.value)
        let gostou = self.stGostou.isOn ? "Sim" : "Não"
        let nota = Int(self.stpNota.value)

        print("O que ele escolheu?")
        print("Volume: \(volume), gostou: \(gostou), nota: \(nota).")

    }

}


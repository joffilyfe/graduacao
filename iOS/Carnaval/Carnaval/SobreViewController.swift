//
//  SobreViewController.swift
//  Carnaval
//
//  Created by admin on 24/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class SobreViewController: UIViewController {


    @IBOutlet var lbQuantidade: UILabel!
    var cadastro:Cadastro!
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

    /*
    override func viewDidLoad() {
        super.viewDidLoad()
        print("viewDidLoad - Sobre")
    }


    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(true)
        print("viewDidDisappear - Sobre")
    }

    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(true)
        print("viewWillDisappear - Sobre")
    }

    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(true)
        print("viewDidAppear - Sobre")
        self.lbQuantidade.text = "1"
    }
     */

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.lbQuantidade.text = String(self.cadastro.quantidade())
    }
}

//
//  ViewController.swift
//  Bancodedados
//
//  Created by admin on 03/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit
import CoreData

class ViewController: UIViewController {

    @IBOutlet var inputNome: UITextField!
    @IBOutlet var inputIdade: UITextField!

    @IBAction func salvar(_ sender: Any) {

        // Resgata app delegate
        let appDelegate = UIApplication.shared.delegate as! AppDelegate

        // Resgata o contexto do persistence
        let context = appDelegate.persistentContainer.viewContext

        // Associa a tabela a uma classe (ORM)
        let pessoa = NSEntityDescription.insertNewObject(forEntityName: "Pessoa", into: context)
        pessoa.setValue(self.inputNome.text, forKey: "nome")
        pessoa.setValue(Int(self.inputIdade.text!), forKey: "idade")

        do {
            try context.save()
            print("Salva")
        } catch {
            print("Falhou")
        }
    }

    @IBAction func listart(_ sender: Any) {
        // Resgata app delegate
        let appDelegate = UIApplication.shared.delegate as! AppDelegate

        // Resgata o contexto do persistence
        let context = appDelegate.persistentContainer.viewContext

        let request = NSFetchRequest<NSFetchRequestResult>(entityName: "Pessoa")
        request.returnsObjectsAsFaults = false

        do {
            let result = try context.fetch(request)

            if (result.count > 0) {
                for r in result as! [NSManagedObject] {
                    let nome = r.value(forKey: "nome")
                    let idade = r.value(forKey: "idade")

                    print("\(nome) - \(idade)")
                }
            }
        } catch {
            print("ei menino, deu erro nesse resgate")
        }
    }

}


//
//  PrincipalTableViewController.swift
//  Carnaval
//
//  Created by admin on 10/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class PrincipalTableViewController: UITableViewController {

    var cadastro = Cadastro()

    override func viewDidLoad() {
        super.viewDidLoad()
        self.navigationItem.leftBarButtonItem = self.editButtonItem
    }

    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {

        if (segue.identifier == "principal_sobre") {
            let sobreVC = segue.destination as! SobreViewController
            sobreVC.cadastro = self.cadastro
        } else if (segue.identifier == "principal_formulario") {
            let formularioVC = segue.destination as! FormularioViewController
            formularioVC.cadastro = self.cadastro
        }
    }

    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }

    // ?
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.cadastro.quantidade()
    }

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        // É importante definir o identificador da célula.
        // Após isto nós temos que modificar o identificador na table view controller
        let cell = tableView.dequeueReusableCell(withIdentifier: "celula", for: indexPath)
        cell.textLabel?.text = self.cadastro.blocos[indexPath.row].nome

        return cell
     }

    // Move row
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {
        let aux = self.cadastro.blocos[fromIndexPath.row]
        self.cadastro.blocos[fromIndexPath.row] = self.cadastro.blocos[to.row]
        self.cadastro.blocos[to.row] = aux
    }

    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        return true
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.tableView.reloadData()
    }

    // Can edit
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }

    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            self.cadastro.blocos.remove(at: indexPath.row)
            tableView.deleteRows(at: [indexPath], with: .fade)
        }
    }
}

//
//  PrincipalTableViewController.swift
//  Gastos
//
//  Created by admin on 28/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class PrincipalTableViewController: UITableViewController {

    var cadastro:Cadastro!

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        self.tableView.reloadData()
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        self.navigationItem.leftBarButtonItem = self.editButtonItem

        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        self.cadastro = appDelegate.cadastro

    }

    // MARK: - Table view data source
    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }

    // Número de linhas
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.cadastro.quantidade()
    }


    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "celula", for: indexPath)
        cell.textLabel?.text = self.cadastro.gastos[indexPath.row].descricao
        return cell
    }


    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        return true
    }

    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            self.cadastro.remove(pos: indexPath.row)
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }

    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {
        self.cadastro.troca(gasto1: fromIndexPath.row, gasto2: to.row)
    }
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }


    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        let storyboard = UIStoryboard(name: "Main", bundle: nil)
        let vc = storyboard.instantiateViewController(withIdentifier: "FormularioID") as! FormularioViewController
        vc.gasto = self.cadastro.gastos[indexPath.row]
        self.navigationController?.pushViewController(vc, animated: true)
    }

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "principal_formulario" {
            let formularioVC = segue.destination as! FormularioViewController
            formularioVC.cadastro = self.cadastro
            print(formularioVC.cadastro)
        }

        print("hehehee")
    }

}

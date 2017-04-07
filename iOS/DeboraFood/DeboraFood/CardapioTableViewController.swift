//
//  CardapioTableViewController.swift
//  DeboraFood
//
//  Created by admin on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

class CardapioTableViewController: UITableViewController {

    var lanches:Array<Lanche>!

    override func viewDidLoad() {
        super.viewDidLoad()

        self.lanches = Array<Lanche>()
        self.lanches.append(Lanche(nome:"Pão Pizza", valor:4.50, descricao: "Um lindo pão no formato de pizza"))
        self.lanches.append(Lanche(nome:"Coxinha", valor:1.0, descricao: "Coxinha quentinha gostosinha"))
        self.lanches.append(Lanche(nome:"Torta de chocolate", valor:5.00, descricao: "Uma baita torta feita com chocolate"))
    }

    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        let storyboard = UIStoryboard(name: "Main", bundle: nil)
        let vc = storyboard.instantiateViewController(withIdentifier: "LancheID") as! LancheViewController

        vc.lanche = self.lanches[indexPath.row]

        self.navigationController?.pushViewController(vc, animated: true)
    }


    // MARK: - Table view data source
    override func numberOfSections(in tableView: UITableView) -> Int {
        // #warning Incomplete implementation, return the number of sections
        return 1
    }

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return self.lanches.count
    }

    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "celula_lanche", for: indexPath)
        cell.textLabel?.text = self.lanches[indexPath.row].description
        return cell
    }

    /*
    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }
    */

    /*
    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
    */

    /*
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {

    }
    */

    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }
    */

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}

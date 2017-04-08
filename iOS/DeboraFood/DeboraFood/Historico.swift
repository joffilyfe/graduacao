//
//  Historico.swift
//  DeboraFood
//
//  Created by Joffily Ferreira dos Santos on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation

class Historico:NSObject, NSCoding {
    
    var comandas: Array<Comanda>
    
    override var description: String {
        return "Comandas: \(self.comandas.count)"
    }

    override init () {
        self.comandas = Array<Comanda>()
    }

    required init?(coder aDecoder: NSCoder) {
        self.comandas = aDecoder.decodeObject(forKey: "comandas") as! Array<Comanda>
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.comandas, forKey: "comandas")
    }

    
}

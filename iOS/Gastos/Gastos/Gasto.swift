//
//  Gasto.swift
//  Gastos
//
//  Created by admin on 28/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation


class Gasto:NSObject, NSCoding {
    var descricao:String!
    var valor:Int!
    var data:Date!

    override var description: String {
        return "\(self.descricao)"
    }

    init(descricao:String, valor:Int, data:Date) {
        self.descricao = descricao
        self.valor = valor
        self.data = data
    }

    required init?(coder aDecoder: NSCoder) {
        self.descricao = aDecoder.decodeObject(forKey: "descricao") as! String
        self.valor = aDecoder.decodeObject(forKey: "valor") as! Int
        self.data = aDecoder.decodeObject(forKey: "data") as! Date
    }

    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.descricao, forKey: "descricao")
        aCoder.encode(self.valor, forKey: "valor")
        aCoder.encode(self.data, forKey: "data")
    }
}

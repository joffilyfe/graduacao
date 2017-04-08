//
//  Lanche.swift
//  DeboraFood
//
//  Created by admin on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation


class Lanche:NSObject, NSCoding {

    var nome:String!
    var descricao:String!
    var valor:Decimal!
    var qtd:Int!

    override var description: String {
        return "\(self.nome!) - R$ \(self.valor!)"
    }


    init(nome:String, valor:Decimal, descricao:String) {
        self.nome = nome
        self.valor = valor
        self.descricao = descricao
    }

    required init?(coder aDecoder: NSCoder) {
        self.nome = aDecoder.decodeObject(forKey: "nome") as! String
        self.descricao = aDecoder.decodeObject(forKey: "descricao") as! String
        self.valor = aDecoder.decodeObject(forKey: "valor") as! Decimal
        self.qtd = aDecoder.decodeObject(forKey: "qtd") as! Int
    }

    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.nome, forKey: "nome")
        aCoder.encode(self.descricao, forKey: "descricao")
        aCoder.encode(self.valor, forKey: "valor")
        aCoder.encode(self.valor, forKey: "qtd")
    }

}

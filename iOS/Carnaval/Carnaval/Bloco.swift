//
//  Bloco.swift
//  Carnaval
//
//  Created by admin on 24/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation

class Bloco:NSObject {
    var nome:String!
    var valor:Float!
    var quantidade:Int!

    override var description: String {
        return "Bloco: \(self.nome)"
    }

    init(nome:String, valor:Float, quantidade:Int) {
        self.nome = nome
        self.valor = valor
        self.quantidade = quantidade
    }

}

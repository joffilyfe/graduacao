//
//  Sugestao.swift
//  Andre
//
//  Created by admin on 17/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation

class Sugestao:NSObject {
    var nome:String!
    var chocolate:String!

    override var description: String {
        return "\(self.nome) - \(self.chocolate)"
    }

    init(nome:String, chocolate:String) {
        self.nome = nome
        self.chocolate = chocolate
    }
}

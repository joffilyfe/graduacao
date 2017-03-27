//
//  Sugestao.swift
//  Andre
//
//  Created by admin on 17/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation

class Sugestao:NSObject, NSCoding {
    var nome:String!
    var chocolate:String!
    var data:Date!

    override var description: String {
        return "\(self.nome) - \(self.chocolate)"
    }

    init(nome:String, chocolate:String, data:Date) {
        self.nome = nome
        self.chocolate = chocolate
        self.data = data
    }

    required init?(coder aDecoder: NSCoder) {
        self.nome = aDecoder.decodeObject(forKey: "nome") as! String
        self.chocolate = aDecoder.decodeObject(forKey: "chocolate") as! String
        self.data = aDecoder.decodeObject(forKey: "data") as! Date
    }

    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.nome, forKey: "nome")
        aCoder.encode(self.chocolate, forKey: "chocolate")
        aCoder.encode(self.data, forKey: "data")
    }
}

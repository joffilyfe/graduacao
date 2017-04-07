//
//  Comanda.swift
//  DeboraFood
//
//  Created by admin on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation


class Comanda:NSObject, NSCoding {
    var lanches:Array<Lanche>

    override var description: String {
        return "Lanches: \(self.lanches.count)"
    }

    required init?(coder aDecoder: NSCoder) {
        self.lanches = aDecoder.decodeObject(forKey: "lanches") as! Array<Lanche>
    }

    override init() {
        self.lanches = Array<Lanche>()
    }

    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.lanches, forKey: "lanches")
    }


    func quantidade() -> Int {
        return self.lanches.count
    }

    func add(lanche:Lanche) {
        self.lanches.append(lanche)
    }


    func total() -> Decimal {
        var total:Decimal = 0

        for lanche in self.lanches {
            total += lanche.valor * Decimal(lanche.qtd)
        }

        return total
    }

    func finalizar() {
        print("Obrigado pela preferência")
        self.lanches = Array<Lanche>()
    }
}

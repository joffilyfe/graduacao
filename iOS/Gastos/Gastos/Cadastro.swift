//
//  Cadastro.swift
//  Gastos
//
//  Created by admin on 28/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation


class Cadastro:NSObject, NSCoding {
    var gastos:Array<Gasto>!

    override init() {
        self.gastos = Array<Gasto>()
    }

    required init?(coder aDecoder: NSCoder) {
        self.gastos = aDecoder.decodeObject(forKey: "gastos") as! Array<Gasto>
    }

    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.gastos, forKey: "gastos")
    }


    func add(gasto:Gasto) {
        self.gastos.append(gasto)
    }

    func remove(pos:Int) {
        self.gastos.remove(at: pos)
    }

    func quantidade() -> Int {
        return self.gastos.count
    }

    func troca(gasto1:Int, gasto2:Int) {
        let aux = self.gastos[gasto1]

        self.gastos[gasto1] = self.gastos[gasto2]
        self.gastos[gasto2] = aux
    }
}

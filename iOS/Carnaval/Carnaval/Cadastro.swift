//
//  Cadastro.swift
//  Carnaval
//
//  Created by admin on 24/02/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation


class Cadastro: NSObject {
    var blocos:Array<Bloco>!

    override init() {
        self.blocos = Array<Bloco>()
    }

    func add(bloco:Bloco) {
        self.blocos.append(bloco)
    }

    func quantidade() -> Int {
        return self.blocos.count
    }
}

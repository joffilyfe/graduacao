//
//  Cadastro.swift
//  Andre
//
//  Created by admin on 17/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import Foundation

class Cadastro:NSObject {
    var sugestoes:Array<Sugestao>

    override init() {
        self.sugestoes = Array<Sugestao>()
    }

    func addSugestao(sugestao:Sugestao) {
        self.sugestoes.append(sugestao)
    }

    func removeSugestao(index:Int) {
        self.sugestoes.remove(at: index)
    }

    func total() -> Int {
        return self.sugestoes.count
    }

}

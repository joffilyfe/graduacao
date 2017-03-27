//
//  AppDelegate.swift
//  Andre
//
//  Created by admin on 17/03/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?
    var cadastro: Cadastro!

    func arquivo() -> String {
        return NSSearchPathForDirectoriesInDomains(FileManager.SearchPathDirectory.documentDirectory, FileManager.SearchPathDomainMask.userDomainMask, true)[0] + "/sugestoes"
    }

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?) -> Bool {
        let obj = NSKeyedUnarchiver.unarchiveObject(withFile: self.arquivo())

        if (obj != nil){
            self.cadastro = obj as! Cadastro
        } else {
            self.cadastro = Cadastro()
        }

        return true
    }

    func applicationWillResignActive(_ application: UIApplication) {
        print("resign")
    }

    func applicationDidEnterBackground(_ application: UIApplication) {
        print("enter background..")
        NSKeyedArchiver.archiveRootObject(self.cadastro, toFile: self.arquivo())

    }

    func applicationWillEnterForeground(_ application: UIApplication) {
        print("enter foreground")
    }

    func applicationDidBecomeActive(_ application: UIApplication) {
        print("become active")
    }

    func applicationWillTerminate(_ application: UIApplication) {
        print("vai finalizar")
    }


}


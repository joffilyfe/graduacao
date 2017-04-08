//
//  AppDelegate.swift
//  DeboraFood
//
//  Created by admin on 07/04/17.
//  Copyright © 2017 Joffily. All rights reserved.
//

import UIKit
import CoreData

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?
    var comanda:Comanda!
    var historico: Historico!

    func arquivo() -> String {
        return NSSearchPathForDirectoriesInDomains(FileManager.SearchPathDirectory.documentDirectory, FileManager.SearchPathDomainMask.userDomainMask, true)[0] + "/historico"
    }

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?) -> Bool {

        let obj = NSKeyedUnarchiver.unarchiveObject(withFile: self.arquivo())
        
        /*
         * Inicializando comanda global
        */
        if (self.comanda == nil) {
            self.comanda = Comanda()
        }
        
        /*
         * Carregando histórico do arquivo
        */
        if (obj != nil) {
            self.historico = obj as! Historico
        } else {
            self.historico = Historico()
        }
        
        
        
        /*
         * Definindo cores para o aplicativo
        */

        UINavigationBar.appearance().barTintColor = UIColor(red:0.84, green:0.13, blue:0.13, alpha:1.0)
        UINavigationBar.appearance().tintColor = UIColor(red: 1.00, green: 1.00, blue: 1.00, alpha: 1)
        UINavigationBar.appearance().titleTextAttributes = [NSForegroundColorAttributeName:UIColor(red: 1.00, green: 1.00, blue: 1.00, alpha: 1)]

        
        return true
    }

    func applicationWillResignActive(_ application: UIApplication) {
    }

    func applicationDidEnterBackground(_ application: UIApplication) {
        NSKeyedArchiver.archiveRootObject(self.historico, toFile: self.arquivo())
    }

    func applicationWillEnterForeground(_ application: UIApplication) {
        // Called as part of the transition from the background to the active state; here you can undo many of the changes made on entering the background.
    }

    func applicationDidBecomeActive(_ application: UIApplication) {
        // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
    }

    func applicationWillTerminate(_ application: UIApplication) {
        // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
        // Saves changes in the application's managed object context before the application terminates.
        self.saveContext()
    }

    // MARK: - Core Data stack

    lazy var persistentContainer: NSPersistentContainer = {
        let container = NSPersistentContainer(name: "DeboraFood")
        container.loadPersistentStores(completionHandler: { (storeDescription, error) in
            if let error = error as NSError? {
                fatalError("Unresolved error \(error), \(error.userInfo)")
            }
        })
        return container
    }()

    // MARK: - Core Data Saving support

    func saveContext () {
        let context = persistentContainer.viewContext
        if context.hasChanges {
            do {
                try context.save()
            } catch {
                // Replace this implementation with code to handle the error appropriately.
                // fatalError() causes the application to generate a crash log and terminate. You should not use this function in a shipping application, although it may be useful during development.
                let nserror = error as NSError
                fatalError("Unresolved error \(nserror), \(nserror.userInfo)")
            }
        }
    }

}


package com.ck.proxibanquev3.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Classe permettant d'effectuer tout les tests Junit
 * @author Clement et Karim
 *
 */
@RunWith(Suite.class)
@SuiteClasses({CompteServiceTest.class,ClientServiceTest.class,ConseillerServiceTest.class})
public class AllTests {

}

package org.szpax.brothers.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * Magia springa. Ta klasa docelowo bedzie sluzyla do skonfigurowania security dla naszej aplikacji
 * (no bo nie kazdy uzytkownik moze np. dodawac nowego trenera personalnego do listy). Musimy to jakos
 * kontrolowac. Narazie powiedzielismy tylko springowi tyle, ze ma ignorowac kontrole bezpieczenstwa
 * dla wszystkich requestow (/** - oznacza dowolna sciezke rozpoczynajaca sie od /.
 * Tyle, ze aplikacja jako sciezke rozumie czesc adresu URL za kontekstem aplikacji! Tzn.
 * http://localhost:8080/appContext/akcja <- sciezka dla aplikacji to samo "/akcja", wczesniej to wszystko co mamy
 * zalezy jest wspolne dla wszystkich requestow i identyfikuje aplikacje jako calosc!)
 *
 * Żeby to "dobrze" dzialalo to musielismy rozszerzyc klase WebSecurityConfigurerAdapter <- ona pochodzi
 * ze springa i mowiac szczerze sam nie wiem co dokladnie robi. Wiem, ze konfiguruje logowanie i takie tam.
 *
 * @Configuration - to tez pochodzi ze springa. Dajac taka annotacje mowimy springowi, ze w tej klasie
 * bedziemy nadpisywac jego domyslne ustawienia i spring ma ja uruchomic przy starcie aplikacji.
 *
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /**
     * Override oznacza, ze ta metoda pochodzi z klasy wyzej (WebSecurityConfigurerAdapter)
     *
     * mvcMatchers - to jakies porownywarki adresow url. /** oznacza WSZYSTKIE adresy
     *
     * @param web - ten parametr jest taki sam jak w metodzie w klasie WebSecurityConfigurerAdapter
     *            ktora tutaj chcemy "nadpisac".
     */
    @Override
    public void init(WebSecurity web) {
        web.ignoring().mvcMatchers("/**");
    }
}

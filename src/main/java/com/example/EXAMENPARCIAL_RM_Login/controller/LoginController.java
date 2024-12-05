
package com.example.EXAMENPARCIAL_RM_Login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // Ruta para mostrar el formulario de login
    @RequestMapping("/login")
    public String loginForm() {
        return "login"; // Devuelve el formulario de login
    }

    // Ruta para procesar el formulario de login
    @PostMapping("/login")
    public String login(String usuario, String contrasena, Model model) {
        // Verificar las credenciales
        if ("admin".equals(usuario) && "admin".equals(contrasena)) {
            return "redirect:/login-success"; // Redirigir al éxito
        } else {
            model.addAttribute("error", true); // Mostrar error en la misma página
            return "login"; // Volver a mostrar el formulario con mensaje de error
        }
    }

    // Ruta de éxito después de un login exitoso
    @RequestMapping("/login-success")
    public String loginSuccess() {
        return "login-success"; // Vista de éxito
    }
}

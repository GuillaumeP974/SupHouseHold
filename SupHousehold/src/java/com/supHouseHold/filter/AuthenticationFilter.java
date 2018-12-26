package com.supHouseHold.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns="/faces/connect/*")
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Do nothing
    }

    /**
     * Verifie si l'utilisateur est connecté, si non, l'utilisateur est invité à se connecter.
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        Object user = httpRequest.getSession().getAttribute("user");


        if (user == null) {
            httpResponse.sendRedirect(request.getServletContext().getContextPath() + "/faces/erreur.xhtml");
        } else {
            chain.doFilter(request, response);
        }
    }


    @Override
    public void destroy() {
        // Do nothing
    }

}

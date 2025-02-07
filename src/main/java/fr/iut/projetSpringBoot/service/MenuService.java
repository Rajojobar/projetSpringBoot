package fr.iut.projetSpringBoot.service;

import org.springframework.stereotype.Service;

import fr.iut.projetSpringBoot.repository.MenuRepository;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public MenuRepository getMenuRepository() {
        return menuRepository;
    }

    

}

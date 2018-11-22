package de.stoxygen.controller;

import de.stoxygen.RestfulClient;
import de.stoxygen.configuration.StoxygenWebinterfaceConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BondController {
    private static final Logger logger = LoggerFactory.getLogger(BondController.class);

    @Autowired
    private RestfulClient restfulClient;

    @Autowired
    private StoxygenWebinterfaceConfiguration stoxygenWebinterfaceConfiguration;

    @RequestMapping(value = "/bonds", method = RequestMethod.GET)
    public String getAllBonds(Model model) {
        model.addAttribute("bonds", restfulClient.getAllBonds(stoxygenWebinterfaceConfiguration.getDownloaderUrl()));
        return "bonds";
    }

    @RequestMapping(value = "/bond/{isin}", method = RequestMethod.GET)
    public String showBondChart(@PathVariable(value = "isin") String isin, Model model) {
        model.addAttribute("title", isin);
        model.addAttribute("downloader_url", stoxygenWebinterfaceConfiguration.getDownloaderUrl());
        model.addAttribute("indicator_url", stoxygenWebinterfaceConfiguration.getIndicatorUrl());
        return "bond_detail";
    }
}

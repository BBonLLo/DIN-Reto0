/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package din.reto0.model;

import din.reto0.ui.SwingView;

/**
 *
 * @author unaib
 */
public class ViewImplementationSwing implements View {

    @Override
    public void showGreeting(String greet) {
        SwingView swingView = new SwingView(greet);
        swingView.setVisible(true);
    }
    
}

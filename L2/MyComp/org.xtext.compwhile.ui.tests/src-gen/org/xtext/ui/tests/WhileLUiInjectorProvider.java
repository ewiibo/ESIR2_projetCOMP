/*
 * generated by Xtext 2.23.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.compwhile.ui.internal.CompwhileActivator;

public class WhileLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CompwhileActivator.getInstance().getInjector("org.xtext.WhileL");
	}

}

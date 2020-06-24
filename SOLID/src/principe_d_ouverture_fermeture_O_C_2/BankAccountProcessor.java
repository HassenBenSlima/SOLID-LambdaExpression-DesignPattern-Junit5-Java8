package principe_d_ouverture_fermeture_O_C_2;

import java.text.Normalizer.Form;

import javax.xml.transform.Result;

class BankAccountProcessor {

	private ReportSupport delegate;

	public void extractAndGenerateReport(Form form) {
		Result res = search(form);
		delegate = getExtractor(form);
		delegate.generate(res);
	}

	private ReportSupport getExtractor(Form form) {
		// find the right implementation according to support choice
		return delegate;
	}

	private Result search(Form form) {
		return null;
	}
}
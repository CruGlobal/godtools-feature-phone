

import java.io.InputStream;


public class MyParser {

	private String headings = "";
	private String numbers = "";
	private String peekpanels = "";
	private String subheads = "";
	private String buttontexts = "";
	private String buttonimages = "";
	private String panelbuttons = "";
	private String panelimages = "";
	private String paneltexts = "";
	private String texts = "";
	private String images = "";
	private String questions = "";

	public MyParser(String path) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler MyHandler = new DefaultHandler() {
				boolean heading = false;
				boolean number = false;
				boolean peekpanel = false;
				boolean subheading = false;
				boolean buttontext = false;
				boolean bimage = false;
				boolean pbutton = false;
				boolean pimage = false;
				boolean ptext = false;
				boolean text = false;
				boolean image = false;
				boolean question = false;

				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase("HEADING")) {
						heading = true;
					}

					if (qName.equalsIgnoreCase("NUMBER")) {
						number = true;
					}

					if (qName.equalsIgnoreCase("PEEKPANEL")) {
						peekpanel = true;
					}

					if (qName.equalsIgnoreCase("SUBHEADING")) {
						subheading = true;
					}
					if (qName.equalsIgnoreCase("BUTTONTEXT")) {
						buttontext = true;
					}

					if (qName.equalsIgnoreCase("BIMAGE")) {
						number = true;
					}

					if (qName.equalsIgnoreCase("PBUTTON")) {
						pbutton = true;
					}
					if (qName.equalsIgnoreCase("PIMAGE")) {
						pimage = true;
					}

					if (qName.equalsIgnoreCase("PTEXT")) {
						ptext = true;
					}

					if (qName.equalsIgnoreCase("TEXT")) {
						text = true;
					}

					if (qName.equalsIgnoreCase("IMAGE")) {
						image = true;
					}
					if (qName.equalsIgnoreCase("QUESTION")) {
						question = true;
					}

				}

				public void characters(char ch[], int start, int length)
						throws SAXException {

					if (heading) {
						headings = (new String(ch, start, length));
						heading = false;
					}

					if (number) {
						numbers = (new String(ch, start, length));
						number = false;
					}

					if (peekpanel) {
						peekpanels = (new String(ch, start, length));
						peekpanel = false;
					}

					if (subheading) {
						subheads = (new String(ch, start, length));
						subheading = false;
					}
					if (buttontext) {
						buttontexts = (new String(ch, start, length));
						buttontext = false;
					}
					if (bimage) {
						buttonimages = (new String(ch, start, length));
						bimage = false;
					}
					if (pbutton) {
						panelbuttons = (new String(ch, start, length));
						pbutton = false;
					}
					if (pimage) {
						panelimages = (new String(ch, start, length));
						pimage = false;
					}
					if (ptext) {
						paneltexts = (new String(ch, start, length));
						ptext = false;
					}
					if (text) {
						texts = (new String(ch, start, length));
						text = false;
					}
					if (image) {
						images = (new String(ch, start, length));
						image = false;
					}
					if (question) {
						questions = (new String(ch, start, length));
						question = false;
					}
				}

			};
                        try {
                        
                            InputStream file = getClass().getResourceAsStream(path);
                        saxParser.parse(file, MyHandler);
                    } catch (Exception e) {
                    }
                        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getHeading() {
		return headings;
	}

	public String getNumber() {
		return numbers;
	}

	public String getPeekPanel() {
		return peekpanels;
	}

	public String getSubHeading() {
		return subheads;
	}

	public String getButtonImage() {
		return buttonimages;
	}

	public String getButtonText() {
		return headings;
	}

	public String getPanelButton() {
		return panelbuttons;
	}

	public String getPanelImage() {
		return panelimages;
	}

	public String getPanelText() {
		return paneltexts;
	}

	public String getText() {
		return texts;
	}

	public String getImage() {
		return images;
	}

	public String getQuestions() {
		return questions;
	}

}

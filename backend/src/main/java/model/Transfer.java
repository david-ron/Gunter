package model; /**
 * @program: translation
 * @description: Including translation methods
 * @author: Zhijing Ling
 * @create: 2018-11-17 19:08
 **/

// Imports the Google Cloud client library

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;


public class Transfer {

    Translate translate;

    public Transfer() {
        this.translate = TranslateOptions.getDefaultInstance().getService();
    }

    public String toEnglish(String source) {

        Translation translation = translate.translate(
                        source,
                        TranslateOption.sourceLanguage(translate.detect(source).getLanguage()),
                        TranslateOption.targetLanguage("en"));

        return translation.getTranslatedText();

    }
}

package org.protege.editor.owl.model.search;

/**
 * @author Josef Hardi <johardi@stanford.edu> <br>
 * Stanford Center for Biomedical Informatics Research
 */
public interface SearchStringParser {

    void parse(String searchString, SearchInputHandler handler);
}

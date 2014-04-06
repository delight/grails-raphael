package raphael

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(RaphaelTagLib)
class RaphaelTagLibSpec extends Specification {

	void "test ra:raphael tag"() {
		expect:
			applyTemplate('<ra:raphael />') == """<script src="null/js/raphael/raphael-min.js" type="text/javascript"></script>"""
	}
}

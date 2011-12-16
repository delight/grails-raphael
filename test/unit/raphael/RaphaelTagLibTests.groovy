package raphael



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(RaphaelTagLib)
class RaphaelTagLibTests {

    void testRa_RaphaelTag() {
    	def ra = new RaphaelTagLib()
    	assert ra.raphael() == """<script src="null/js/raphael/raphael-min.js" type="text/javascript"></script>"""
    }
}

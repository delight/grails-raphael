package raphael

class RaphaelTagLib {

	static namespace = "ra"

	def pluginManager

	def raphael = { attrs ->
		def dev = grails.util.GrailsUtil.isDevelopmentEnv()
		def raphaelFile = "raphael${dev?'':'-min'}.js"
		out << "<script src=\"${g.resource(plugin:'raphael', dir:'js/raphael', file:raphaelFile)}\" type=\"text/javascript\"></script>"
	}
}

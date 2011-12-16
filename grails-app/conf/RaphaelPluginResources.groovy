// Resource declarations for Resources plugin
def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def raphaelFile = "raphael${dev?'':'-min'}.js"


modules = {
    'raphael' {
        resource id:'js', url:[plugin: 'raphael', dir:'js/raphael', file:raphaelFile], 
            disposition:'head', nominify: !dev
    }
}
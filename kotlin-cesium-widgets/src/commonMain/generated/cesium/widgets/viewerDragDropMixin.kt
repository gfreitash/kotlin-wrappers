// Automatically generated - do not modify!

@file:JsModule("@cesium/widgets")

package cesium.widgets

import cesium.engine.Proxy
import js.objects.JsPlainObject
import web.dom.Element

/**
 * A mixin which adds default drag and drop support for CZML files to the Viewer widget.
 * Rather than being called directly, this function is normally passed as
 * a parameter to [Viewer.extend], as shown in the example below.
 * ```
 * // Add basic drag and drop support and pop up an alert window on error.
 * const viewer = new Viewer('cesiumContainer');
 * viewer.extend(viewerDragDropMixin);
 * viewer.dropError.addEventListener(function(viewerArg, source, error) {
 *     window.alert('Error processing ' + source + ':' + error);
 * });
 * ```
 * @param [viewer] The viewer instance.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#viewerDragDropMixin">Online Documentation</a>
 */
external fun viewerDragDropMixin(
    viewer: Viewer,
    options: ViewerDragDropMixinOptions? = definedExternally,
)

/**
 * @property [dropTarget] The DOM element which will serve as the drop target.
 *   Default value - [viewer.container]
 * @property [clearOnDrop] When true, dropping files will clear all existing data sources first, when false, new data sources will be loaded after the existing ones.
 *   Default value - `true`
 * @property [flyToOnDrop] When true, dropping files will fly to the data source once it is loaded.
 *   Default value - `true`
 * @property [clampToGround] When true, datasources are clamped to the ground.
 *   Default value - `true`
 * @property [proxy] The proxy to be used for KML network links.
 */
@JsPlainObject
external interface ViewerDragDropMixinOptions {
    val dropTarget: Element?
    val clearOnDrop: Boolean?
    val flyToOnDrop: Boolean?
    val clampToGround: Boolean?
    val proxy: Proxy?
}

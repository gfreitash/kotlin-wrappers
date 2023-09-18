// Automatically generated - do not modify!

package muix.tree.view

import mui.material.styles.Theme
import mui.system.SxProps
import web.cssom.ClassName

external interface TreeItemProps :
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * className applied to the root element.
     */
    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TreeItemClasses?

    /**
     * The icon used to collapse the node.
     */
    var collapseIcon: react.ReactNode?

    /**
     * The component used for the content node.
     * @default TreeItemContent
     */
    var ContentComponent: react.ComponentType<TreeItemContentProps>?

    /**
     * Props applied to ContentComponent.
     */
    var ContentProps: react.dom.html.HTMLAttributes<web.html.HTMLElement>?

    /**
     * If `true`, the node is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The icon displayed next to an end node.
     */
    var endIcon: react.ReactNode?

    /**
     * The icon used to expand the node.
     */
    var expandIcon: react.ReactNode?

    /**
     * The icon to display next to the tree node's label.
     */
    var icon: react.ReactNode?

    /**
     * This prop isn't supported.
     * Use the `onNodeFocus` callback on the tree if you need to monitor a node's focus.
     */
    @Deprecated("See documentation")
    override var onFocus: react.dom.events.FocusEventHandler<web.html.HTMLLIElement>?

    /**
     * The tree node label.
     */
    var label: react.ReactNode?

    /**
     * The id of the node.
     */
    var nodeId: String

    /**
     * The component used for the transition.
     * [Follow this guide](/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<mui.material.transitions.TransitionProps>?

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     */
    var TransitionProps: mui.material.transitions.TransitionProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface TreeItemOwnerState {
    var expanded: Boolean

    var focused: Boolean

    var selected: Boolean

    var disabled: Boolean
}
